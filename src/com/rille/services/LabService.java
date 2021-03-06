package com.rille.services;

import com.rille.common.pojo.Lab;
import java.util.List;
import java.util.Map;

import com.rille.common.pojo.User;

public interface LabService {
    public List<Lab> getLabs();

    /**
     * 根据实验室进行统计信息。
     * @param user
     * @param labId
     * @return 关于统计信息的Map集合
     */
    public Map<String, Object> statisticsById(User user, String labId);
}
