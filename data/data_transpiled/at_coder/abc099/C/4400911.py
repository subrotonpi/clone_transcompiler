def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    dp = [ ]
    dp.append ( sys.maxint - 1 )
    dp.append ( 0 )
    set = set ( [ 1 ] )
    num = 1
    while num <= n :
        num *= 6
        set.add ( num )
    num = 1
    while num <= n :
        num *= 9
        set.add ( num )
    for val in set :
        for i in range ( val , len ( dp ) ) :
            dp [ i ] = min ( dp [ i ] , 1 + dp [ i - val ] )
    print ( dp [ n ] )
