$(function() {
    var timeOut = function() {
        $("#lotteryBtn").rotate({
            angle:0,
            duration:1000,
            animateTo:2160,
            callback:function() {
                alert("很遗憾，没有中奖哦！！！");
            }
        });
    };

    var rotateFunc = function(awards, angle, text) {
        $("#lotteryBtn").stopRotate();
        $("#lotteryBtn").rotate({
            angle:0,
            duration:5000,
            animateTo:angle+1440,
            callback:function() {
                alert(text);
            }
        });
    }

    $("#lotteryBtn").rotate({
        bind:{
            click:function() {
                var time = [1];
                time = time[Math.floor(Math.random()*time.length)]
                if (time == 0) {
                    timeOut();
                }
                if(time == 1) {
                    var data = [1,2,3];
                    data = data[Math.floor(Math.random()*data.length)];
                    $.ajax({
                        type: "GET",
                        url: "../banana/test",
                        data: {num: data},
                        dataType: "json",
                        success: function(data){
                            if(data==0 || data == 1){
                                var angle = [67,112,202,292,337];
                                angle = angle[Math.floor(Math.random()*angle.length)]
                                rotateFunc(0,angle,'很遗憾，这次您未抽中奖')
                            }
                            if(data == 2) {
                                rotateFunc(2,247,'恭喜您抽中的二等奖');
                            }
                            if(data == 3) {
                                rotateFunc(3,22,'恭喜您抽中的三等奖');
                            }
                        }
                    });
                }
            }
        }
    });
});
