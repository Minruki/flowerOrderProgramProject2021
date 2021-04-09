package flowerOrderProgramProject.ui;

// 로그인 화면 실행을 위한 코드

public class FlowerMainProgram{
   public flowerOrderProgramProject.ui.FlowerLoginView flowerloginView;
   FlowerFrm flowerFrm;
  
   public static void main(String[] args) {
      
       // 메인클래스 실행
       FlowerMainProgram main = new FlowerMainProgram();
       main.flowerloginView = new flowerOrderProgramProject.ui.FlowerLoginView(); // 로그인창 보이기
       main.flowerloginView.setMain(main); // 로그인창에게 메인 클래스보내기
   }
  
   // 테스트프레임창
   public void showFrameTest(){
       flowerloginView.dispose(); // 로그인창닫기
       this.flowerFrm = new FlowerFrm(); // 테스트프레임 오픈
   }

}
