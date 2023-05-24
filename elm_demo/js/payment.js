window.onload = function(){
	//获取显示隐藏dom对象
	let showBtn = document.getElementById('showBtn');
	// 获取订单明细dom对象
	let detailedBox = document.getElementById('detailedBox');
	//设置初始状态为隐藏
	detailedBox.style.display = 'none';
	showBtn.onclick = function(){
		if(detailedBox.style.display == 'none'){
			detailedBox.style.display = 'block';
		}else{
			detailedBox.style.display = 'none';
		}
	}
}