package com.fulinlin.constant;

/**
 * @program: git-commit-message-helper
 * @author: fulin
 * @create: 2019-12-08 11:37
 **/
public class GitCommitConstants {
    public static final String DEFAULT_TEMPLATE = "#if($type=='requirement')需求编号#elseif($type=='issue')issue编号#elseif($type=='bug')缺陷编号#end：#if($parentBianHao)${parentBianHao}#end\n" +
            "#if($type=='requirement')需求标题#elseif($type=='issue')issue标题#elseif($type=='bug')缺陷标题#end：#if($parentBiaoTi)${parentBiaoTi}#end\n" +
            "任务单编号：#if($childBianHao)${childBianHao}#end\n" +
            "任务单标题：#if($childBiaoTi)${childBiaoTi}#end";
}
