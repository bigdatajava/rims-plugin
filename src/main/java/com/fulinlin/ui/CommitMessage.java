package com.fulinlin.ui;

import com.fulinlin.model.CommitTemplate;
import com.fulinlin.model.TypeAlias;
import com.fulinlin.storage.GitCommitMessageHelperSettings;
import com.fulinlin.utils.VelocityUtils;
import org.apache.commons.lang.StringUtils;

/**
 * @author fulin
 */
public class CommitMessage {
    private static final int MAX_LINE_LENGTH = 72; // https://stackoverflow.com/a/2120040/5138796
    private final String content;

    public CommitMessage(GitCommitMessageHelperSettings settings, TypeAlias typeAlias, String changeScope, String shortDescription, String longDescription, String breakingChanges) {
        this.content = buildContent(
                settings,
                typeAlias,
                changeScope,
                shortDescription,
                longDescription,
                breakingChanges
        );
    }

    private String buildContent(GitCommitMessageHelperSettings settings,
                                TypeAlias typeAlias,
                                String changeScope,
                                String shortDescription,
                                String longDescription,
                                String breakingChanges
    ) {

        CommitTemplate commitTemplate = new CommitTemplate();
        if (typeAlias != null) {
            if (StringUtils.isNotBlank(typeAlias.getTitle())) {
                commitTemplate.setType(typeAlias.getTitle());
            }
        }
        if (StringUtils.isNotBlank(changeScope)) {
            commitTemplate.setParentBianHao(changeScope);
        }
        if (StringUtils.isNotBlank(shortDescription)) {
            commitTemplate.setParentBiaoTi(shortDescription);
        }
        if (StringUtils.isNotBlank(longDescription)) {
            commitTemplate.setChildBianHao(longDescription);
        }
        if (StringUtils.isNotBlank(breakingChanges)) {
            commitTemplate.setChildBiaoTi(breakingChanges);
        }
        String template = settings.getDateSettings().getTemplate();
        return VelocityUtils.convert(template, commitTemplate);
    }

    @Override
    public String toString() {
        return content;
    }
}