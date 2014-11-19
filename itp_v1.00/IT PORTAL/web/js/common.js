function popUp(strURL,strType,strHeight,strWidth) 
{
    var strOptions="";
    if (strType=="console") strOptions="resizable,height="+strHeight+",width="+strWidth;
    if (strType=="fixed") strOptions="status,height="+strHeight+",width="+strWidth;
    if (strType=="elastic") strOptions="toolbar=no,menubar=no,scrollbars,resizable,location=no,height="+strHeight+",width="+strWidth;
    window.open(strURL, 'newWin', strOptions);
}
