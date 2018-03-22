package com.pwc.desingerPattern.observePattern;

public class ObservepatternTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MeetingMemo memo = new MeetingMemo();
      
      memo.registerObserver(new FormTeam());
      memo.registerObserver(new ConfigTeam());
      memo.meetingmMemoChanged("latest information has come.Please inform down Stream!");
      
      
	}

}
