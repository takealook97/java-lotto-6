package lotto.exception;

public enum ErrorMessage {
	EMPTY_ERROR("[ERROR] 입력을 하지 않았습니다."),
	NUMBER_FORMAT_ERROR("[ERROR] 숫자를 입력해주세요."),
	PRICE_ERROR("[ERROR] 로또는 1 장당 1000원 입니다. 1000의 배수를 입력해주세요."),
	INPUT_COUNT_ERROR("[ERROR] 번호는 6개를 선택해야 합니다."),
	RANGE_ERROR("[ERROR] 1 ~ 45 범위의 자연수만 입력 가능합니다."),
	DUPLICATED_ERROR("[ERROR] 중복된 번호를 입력할 수 없습니다.");

	private final String message;

	ErrorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
