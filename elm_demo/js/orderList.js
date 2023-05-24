window.onload = function(){
	//获得显示隐藏按钮DOM数组
	let showBtnArr = document.getElementsByClassName('fa-caret-down')
	//获取订单明细DOM数组
	let detailedBoxArr = document.getElementsByClassName('order-detail')
	
	for(let i = 0; i<showBtnArr.length; i++){
		detailedBoxArr[i].style.display='none';
	}
	for(let i = 0; i<showBtnArr.length; i++){
		showBtnArr[i].onclick = function(){
			if(detailedBoxArr[i].style.display == 'none'){
				detailedBoxArr[i].style.display = 'block';
			}else{
				detailedBoxArr[i].style.display = 'none';
			}
		}
	}
}