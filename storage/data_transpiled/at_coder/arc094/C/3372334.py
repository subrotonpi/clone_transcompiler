def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.getmaxyx ( )
        a = [ sc.choice ( a ) for i in range ( n ) ]
        b = [ sc.choice ( b ) for i in range ( n ) ]
        ans = help ( a , b )
        sys.stdout.write ( ans )
    def help ( a , b ) :
        b = [ ]
        flag = True
        for i in range ( len ( a ) ) :
            flag &= ( a [ i ] == b [ i ] )
        if flag : return 0
        sum = 0
        min = sys.maxint
        for i in range ( len ( a ) ) :
            sum += b [ i ]
            if a [ i ] > b [ i ] :
                min = min ( min , b [ i ] )
        return sum - min
