def main ( ) :
    from itertools import izip
    solver ( )
    def show ( a ) :
        sc = izip ( a , range ( 1 , n ) )
        n = sc.__next__ ( )
        m = sc.__next__ ( )
        a = [ ]
        odd = [ ]
        ord = [ ]
        for i in range ( m ) :
            a.append ( sc.__next__ ( ) )
            if a [ i ] % 2 :
                odd.append ( a [ i ] )
                ord.append ( i )
        if m == 1 :
            show ( a )
            if a [ 0 ] != 1 :
                print ( 2 )
                print ( ( a [ 0 ] - 1 ) , 1 )
            else :
                print ( 1 )
                print ( a [ 0 ] )
            return
        elif m == 2 :
            show ( a )
            count = 1
            if a [ 0 ] != 1 :
                count += 1
            if a [ 1 ] != 1 :
                count += 1
            print ( count )
            if a [ 0 ] != 1 :
                print ( ( a [ 0 ] - 1 ) , 2 )
            if a [ 1 ] != 1 :
                print ( ' ' , a [ 1 ] - 1 )
            else :
                print ( )
            return
        if len ( odd ) > 2 :
            print ( 'Impossible' )
            return
        else :
            if ord :
                d = a [ 0 ]
                a [ 0 ] = odd [ 0 ]
                a [ ord [ 0 ] ] = d
                if len ( ord ) == 2 :
                    d = a [ m - 1 ]
                    a [ m - 1 ] = odd [ 1 ]
                    a [ ord [ 1 ] ] = d
            show ( a )
            count = m - 1
            if a [ 0 ] != 1 :
                count += 1
            if len ( a ) == 2 :
                print ( 'Impossible' )
                return
            else :
                print ( )
                return
    show ( )
