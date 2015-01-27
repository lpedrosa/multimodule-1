package client;

import core.StringJumbler;

public class StringJumblerServiceImpl implements StringJumblerService {
	
	private final StringJumbler jumbler;
	
	public StringJumblerServiceImpl() {
		this.jumbler = new StringJumbler();
	}

	@Override
	public String jumbleMuhString(String str) throws Exception {
		if(Math.random() < 0.2)
			throw new Exception("I am rubbish so I failed!");
		return this.jumbler.jumble(str);
	}

}
