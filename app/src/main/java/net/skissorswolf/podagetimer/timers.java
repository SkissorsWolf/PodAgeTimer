package net.skissorswolf.podagetimer;

/**
 * Created by Skissors_Wolf on 5/8/2015.
 */




public class timers {

    public String millisecondsToString() {
        long nDate = System.currentTimeMillis();

        double dHours;
        double dMinutes;
        double dSeconds;
        dHours = Math.floor(nDate / 60 / 60 / 1000);
        dMinutes = Math.floor(nDate / 60 / 1000) - (dHours * 60);
        dSeconds = Math.floor(nDate / 1000) - (dMinutes * 60 + dHours * 60 * 60);

        int iHours = (int)dHours;
        int iMinutes = (int)dMinutes;
        int iSeconds = (int)dSeconds;

        String sHours = Integer.toString(iHours % 24);
        String sMinutes = Integer.toString(iMinutes);
        String sSeconds = Integer.toString(iSeconds);

        if(iHours < 10) {
            sHours = "0" + sHours;
        }
        if(iMinutes < 10) {
            sMinutes = "0" + sMinutes;
        }
        if(iSeconds < 10) {
            sSeconds = "0" + sSeconds;
        }
        String sTime = sHours + ":" + sMinutes + ":" + sSeconds;
        return sTime;
    }

    public long millisecondsSinceEpoch() {
        long lTime = System.currentTimeMillis();
        return lTime;
    }

    /* public String outputTime() {
       return millisecondsToString(sTime);
    } */

    /* public long millisecondsFromeTime(TimeString) {
        Date dateObj = new Date("1/1/1970 ", + TimeString + " UTC");
        return ((dateObj.getUTCHours() * 60 + dateObj.getUTCMinutes()) * 60 + dateObj.getUTCSeconds()) * 1000 + dateObj.getUTCMilliseconds();
    } */

    /* public String millisecondsToString(long Milliseconds) {
        double Hours = 0;
        double Minutes = 0;
        double Seconds = 0;
        String sHours = Double.toString(Hours);
        String sMinutes = Double.toString(Minutes);
        String sSeconds = Double.toString(Seconds);
        if(Milliseconds < 0) {
            Milliseconds = -Milliseconds;
        }
        Hours = Math.floor(Milliseconds / 60 / 60 / 1000);
        Minutes = Math.floor(Milliseconds / 60 / 1000) - (Hours * 60);
        Seconds = Math.floor(Milliseconds / 1000) - (Minutes * 60 + Hours * 60 * 60);
        if(Hours < 0) {
            sHours = "-0" + Math.abs(Hours);
        } else if(Hours < 10) {
            sHours = "0" + Hours;
        }
        if(Minutes < 10) {
            sMinutes = "0" + Minutes;
        }
        if(Seconds < 10) {
            sSeconds = "0" + Seconds;
        }
        return sHours + ":" + sMinutes + ":" + sSeconds;
    } */

    /* public void millisecondsFromDate(Date nDate) {
        long tmp = new Date(nDate);
        return tmp.setMilliseconds(tmp.getMilliseconds() + 0);
    } */

    /* public void dateLoop(iterations, startdate, increment) {
        loopdate = startdate;
        today = new Date();

        while(millisecondsFromDate(loopdate) < millisecondsFromDate(today)) {
            loopdate = addTimeToDateGeneral(increment, loopdate);
        }
        return output;
    } */

    /* public void updateCounters() {
        now = new Date();
        nowM = millisecondsFromDate(now);
        negOffset = millisecondsFromDate(negInfo.firstTime) - nowM;
        derOffset =;
        payOffset =;
        tetOffset =;
        girOffset =;
        if(negOffset < 0) {
            negInfo = dateLoop(iterations, negStart, dayLength);
            negOffset = millisecondsFromDate(negInfo.firstTime) - nowM;
            // document.getElementById('negout').innerHTML = negInfo.HTMLString;
        }
        if(derOffset < 0) {
            derInfo = dateLoop(iterations, derStart, dayLength);
            derOffset = millisecondsFromDate(derInfo.firstTime) - nowM;
            // document.getElementById('derout').innerHTML = derInfo.HTMLString;
        }
        if(payOffset < 0) {
            payInfo = dateLoop(iterations, payStart, dayLength);
            payOffset = millisecondsFromDate(payInfo.firstTime) - nowM;
            // document.getElementById('payout').innerHTML = payInfo.HTMLString;
        }
        if(tetOffset < 0) {
            tetInfo = dateLoop(iterations, tetStart, dayLength);
            tetOffset = millisecondsFromDate(tetInfo.firstTime) - nowM;
            // document.getElementById('tetout').innerHTML = tetInfo.HTMLString;
        }
        if(girOffset < 0) {
            girInfo = dateLoop(iterations, girStart, dayLength);
            girOffset = millisecondsFromDate(girInfo.firstTime) - nowM;
            // document.getElementById('girout').innerHTML = girInfo.HTMLString;
        } */

        /*
        document.getElementById('negoutCount').innerHTML = MillisecondsToString(negOffset);
    	document.getElementById('deroutCount').innerHTML = MillisecondsToString(derOffset);
	    document.getElementById('payoutCount').innerHTML = MillisecondsToString(payOffset);
	    document.getElementById('tetoutCount').innerHTML = MillisecondsToString(tetOffset);
    	document.getElementById('giroutCount').innerHTML = MillisecondsToString(girOffset);

        setTimeout("UpdateCounters()", 100);
    } */

    /*
    if(document.getElementById('negout')) {
	negStart = document.getElementById('negout').innerHTML;
	derStart = document.getElementById('derout').innerHTML;
	payStart = document.getElementById('payout').innerHTML;
	tetStart = document.getElementById('tetout').innerHTML;
        girStart = document.getElementById('girout').innerHTML;
	dayLength = document.getElementById('negoutCount').innerHTML;
        iterations = document.getElementById('deroutCount').innerHTML;
        girIterations = document.getElementById('giroutCount').innerHTML;

	negInfo = DateLoop(iterations, negStart, dayLength);
	derInfo = DateLoop(iterations, derStart, dayLength);
	payInfo = DateLoop(iterations, payStart, dayLength);
	tetInfo = DateLoop(iterations, tetStart, dayLength);
	girInfo = DateLoop(girIterations, girStart, MillisecondsFromTime('10:00:00'));

	document.getElementById('negout').innerHTML = negInfo.HTMLString;
	document.getElementById('derout').innerHTML = derInfo.HTMLString;
	document.getElementById('payout').innerHTML = payInfo.HTMLString;
	document.getElementById('tetout').innerHTML = tetInfo.HTMLString;
	document.getElementById('girout').innerHTML = girInfo.HTMLString;

	setTimeout("UpdateCounters()", 100);
    }
    */
}
