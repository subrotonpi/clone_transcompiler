def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        res = 0
        a = [ ]
        d = { }
        for i in range ( n ) :
            a.append ( sc.__next__ ( ) )
            d [ a [ i ] ] = d.get ( a [ i ] , 0 ) + 1
        a.sort ( lambda x , y : y - x )
        for key in a :
            count_key = d.get ( key , 0 )
            if count_key > 0 :
                d [ key ] = count_key - 1
                diff = sum ( d [ key ] * 2 - key )
                count_diff = d.get ( diff , 0 )
                if count_diff > 0 :
                    d [ diff ] = count_diff - 1
                    res += 1
                else :
                    d [ key ] = count_key
        print ( res )
