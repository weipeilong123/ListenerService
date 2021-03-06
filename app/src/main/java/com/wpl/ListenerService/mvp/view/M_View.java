package com.wpl.ListenerService.mvp.view;

import com.wpl.ListenerService.bean.ClientUser;
import com.wpl.ListenerService.bean.FeedbackData;

import java.util.List;
import java.util.Map;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;

/**
 * view
 * Created by Administrator on 2017/2/22.
 */

public interface M_View {

    /**
     * 登录
     */
    interface LoginView {
        void loginSuccess(BmobUser bmobUser);

        void loginError(BmobException e);
    }

    /**
     * 被控端列表
     */
    interface ClientListView {
        void loadSuccess(List<ClientUser> clientUser);

        void loadError(BmobException e);
    }

    /**
     * 获取被控端上传的数据
     */
    interface FeedbackDataView {
        void loadSuccess(List<FeedbackData> dataList);

        void loadError(BmobException e);
    }

    /**
     * 获取某一条数据
     */
    interface AFeedbackData {
        void loadSuccess(FeedbackData data);

        void loadError(BmobException e);
    }

    /**
     * 更改状态
     */
    interface FeedbackChangeView {
        void changeSuccess();

        void changeError(BmobException e);
    }

    /**
     * 删除返回的数据
     */
    interface FDDataDeleteView {
        void deleteSuccess();

        void deleteError(BmobException e);
    }

    /**
     * 修改密码
     */
    interface ChangeUserPassView {
        void changeSuccess();

        void changeError(BmobException e);
    }

    /**
     * 修改被控端备注
     */
    interface UpClientInfoView {
        void onSuccess();

        void onError(BmobException e);
    }

    /**
     * 清空数据
     */
    interface ClearLogDataView {
        void clearSuccess();

        void clearError(BmobException e);
    }

    /**
     * 获取当前位置信息
     */
    interface CurrentLocationView {
        void locationSuccess(Map<String, Object> map);

        void locationError(Map<String, Object> map);
    }
}
