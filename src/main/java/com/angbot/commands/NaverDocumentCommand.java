package com.angbot.commands;

import java.util.StringTokenizer;

import com.angbot.service.CommandApiService;

public class NaverDocumentCommand extends CommCommand{
	
	public NaverDocumentCommand(CommandApiService service) {
		super(service);
	}
	
	@Override
	public String command() {
		return "!사전";
	}
	
	@Override
	public String run(StringTokenizer token) throws Exception {
		if(!this.validation(token)){
			return "`ex) !사전 단어명`";
		}
		
		return this.service.searchMap(token);
	}
	
	public boolean validation(StringTokenizer token){		
		if(token.countTokens() <= 0){
			return false;
		}
		return true;
	}
	@Override
	public boolean isState() {
		// TODO Auto-generated method stub
		return false;
	}
}
