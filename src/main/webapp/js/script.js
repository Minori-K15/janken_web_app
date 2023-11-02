/**
 * 
 */

// 
document.addEventListener('DOMContentLoaded', function() {
    let nameInput = document.getElementById('name');
    let button = document.getElementById('button');
    
    function validateInputs() {
			// trimメゾット(関数)：文字列の前後の空白を削除してくれる
      	let nameValid = nameInput.value.trim().length <= 10;
      	return nameValid;
    }
    
    function updateButtonState() {
      if (validateInputs()) {
       // 1つでもfalseがあればボタンが赤くなって送信不可
        	button.disabled = false;
        	console.log("成功");
        } else {
        // 全てtureであれば送信
          	button.disabled = true;
        }
    }
    // ボタンの送信結果
    nameInput.addEventListener('input', updateButtonState);
});
