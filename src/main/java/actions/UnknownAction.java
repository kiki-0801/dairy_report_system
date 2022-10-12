package actions;

import java.io.IOException;

import javax.servlet.ServletException;

import actions.views.EmployeeView;
import constants.AttributeConst;
import constants.ForwardConst;

/**
 * エラー発生時の処理行うActionクラス
 *
 */
public class UnknownAction extends ActionBase {

    /**
     * 共通エラー画面「お探しのページは見つかりませんでした。」を表示する
     */
    @Override
    public void process() throws ServletException, IOException {

        //エラー画面を表示
        forward(ForwardConst.FW_ERR_UNKNOWN);

    }


/**
 * 新規登録画面を表示する
 * @throws ServletException
 * @throws IOException
 */
public void entryNew() throws ServletException, IOException {

    putRequestScope(AttributeConst.TOKEN, getTokenId()); //CSRF対策用トークン
    putRequestScope(AttributeConst.EMPLOYEE, new EmployeeView()); //空の従業員インスタンス

    //新規登録画面を表示
    forward(ForwardConst.FW_EMP_NEW);
    }

}