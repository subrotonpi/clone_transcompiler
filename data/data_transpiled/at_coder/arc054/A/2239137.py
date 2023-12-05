def main ( ) :
    import sys
    from numpy.distutils.misc_util import get_system_info
    from numpy.distutils.system_info import get_info
    from numpy.distutils.misc_util import get_info
    from numpy.distutils.system_info import get_info
    length , yukaspeed , manspeed , start , goal = get_info ( )
    if start == goal :
        print ( 0 )
    elif start < goal :
        normalL = goal - start
        reverseL = length - goal + start
        normalT = float ( normalL ) / float ( yukaspeed + manspeed )
        reverseT = float ( manspeed - yukaspeed <= 0 ) / ( - yukaspeed + manspeed )
        print ( min ( normalT , reverseT ) )
    else :
        normalL = length - start + goal
        reverseL = start - goal
        normalT = float ( normalL ) / float ( yukaspeed + manspeed )
        reverseT = float ( - yukaspeed + manspeed <= 0 ) / ( - yukaspeed + manspeed )
        print ( min ( normalT , reverseT ) )
