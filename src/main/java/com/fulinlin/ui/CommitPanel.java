package com.fulinlin.ui;

import com.fulinlin.model.TypeAlias;
import com.fulinlin.storage.GitCommitMessageHelperSettings;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VfsUtil;

import javax.swing.*;
import java.io.File;
import java.util.List;


public class CommitPanel {
    private JPanel mainPanel;
    private JComboBox changeType;
    private JTextField changeScope;
    private JTextField shortDescription;
    private JTextField longDescription;
    private JTextField breakingChanges;

    public CommitPanel(Project project, GitCommitMessageHelperSettings settings) {
        //parameter
        List<TypeAlias> typeAliases = settings.getDateSettings().getTypeAliases();
        for (TypeAlias type : typeAliases) {
            changeType.addItem(type);
        }
       /* fix fulin  File workingDirectory = VfsUtil.virtualToIoFile(project.getBaseDir());
        Command.Result result = new Command(workingDirectory, "git log --all --format=%s | grep -Eo '^[a-z]+(\\(.*\\)):.*$' | sed 's/^.*(\\(.*\\)):.*$/\\1/' | sort -n | uniq").execute();
        if (result.isSuccess()) {
            result.getOutput().forEach(changeScope::addItem);
        }*/
    }

    JPanel getMainPanel() {
        return mainPanel;
    }

    CommitMessage getCommitMessage(GitCommitMessageHelperSettings settings) {
        return new CommitMessage(
                settings,
                (TypeAlias) changeType.getSelectedItem(),
                (String) changeScope.getText().trim(),
                shortDescription.getText().trim(),
                longDescription.getText().trim(),
                breakingChanges.getText().trim()
        );
    }

}
