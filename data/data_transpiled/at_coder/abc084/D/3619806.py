def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = [ 1 ] * 100001
            for i in range ( 2 , 100000 + 1 ) :
                self.x [ i ] = 1
    for i in range ( 2 , 100000 + 1 ) :
        if not x [ i ] :
            continue
        j = i + i
        while j <= 100000 :
            self.x [ j ] = 0
            j += i
    like2017 = [ 1 ] * 100001
    like2017 [ 3 ] = 1
    like2017 [ 5 ] = 1
    for i in range ( 9 , 100000 + 1 , 4 ) :
        if x [ i ] == 1 and x [ ( i + 1 ) // 2 ] == 1 :
            like2017 [ i ] = 1
    for i in range ( 1 , 100000 + 1 ) :
        like2017 [ i ] += like2017 [ i - 1 ]
    f = open ( "/proc/sys/stdin" , "r" )
    q = f.readline ( ).split ( )
    l = [ ]
    r = [ ]
    for i in range ( q ) :
        l.append ( f.readline ( ) )
        r.append ( f.readline ( ) )
    for i in range ( q ) :
        print ( like2017 [ r [ i ] ] - like2017 [ l [ i ] - 1 ] )
