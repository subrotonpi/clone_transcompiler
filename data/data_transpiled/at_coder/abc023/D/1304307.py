def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            with open ( sys.argv [ 1 ] ) as sc :
                N = sc.read ( )
        except IOError :
            N = 0
    H = [ ]
    S = [ ]
    ansmin , ansmax = 0 , int ( sys.maxint ) >> 16
    for i in range ( N ) :
        H.append ( sc.read ( ) )
        S.append ( sc.read ( ) )
        ansmin = max ( ansmin , H [ i ] )
    time = [ ]
    for idx in range ( 80 ) :
        ansmid = ( ansmax + ansmin ) // 2
        f = True
        for i in range ( N ) :
            time.append ( ( ansmid - H [ i ] - 1 ) / S [ i ] )
        time.sort ( )
        for i in range ( 0 , len ( time ) ) :
            if time [ i ] < int ( time [ i ] ) :
                f = False
        if f :
            ansmax = ansmid
        else :
            ansmin = ansmid
    print ( ansmin )
