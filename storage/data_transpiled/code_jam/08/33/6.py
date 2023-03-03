def _gen_clarge ( ) :
    import sys
    import os
    from numpy.lib.stride_tricks import stride_tricks
    class cc ( stride_tricks ) :
        def cauta ( va , li , ls ) :
            if li == ls : return li
            mid = ( li + ls ) // 2
            if vv [ mid ] == va : return mid
            elif vv [ mid ] > va : return cauta ( va , li , mid - 1 )
            else : return cauta ( va , mid + 1 , ls )
        def main ( self ) :
            with open ( "C-large.in" , "r" ) as f :
                input = f.readlines ( )
                out = open ( "large.out" , "w" )
    def cc ( ) :
        with open ( "C-large.in" , "r" ) as f :
            with open ( "C-large.out" , "w" ) as f :
                with open ( "C-large.out" , "w" ) as f :
                    f.writelines ( [ "".join ( [ str ( i ) for i in range ( len ( v ) ) ] ) for i in range ( len ( v ) ) ] )
    def cc ( ) :
        with open ( "C-large.in" , "r" ) as f :
            input = f.readlines ( )
        with open ( "C-large.out" , "w" ) as f :
            with open ( "C-large.out" , "w" ) as f :
                f.writelines ( [ "".join ( [ str ( i ) for i in range ( len ( v ) ) ] ) for i in range ( len ( v ) ) ] )
    for nrt in range ( nrtests ) :
        spl = [ x.strip ( ) for x in input ]
        mod = 1000000007
        n , m , x , y , z = [ int ( x ) for x in spl ]
        a = [ int ( x ) for x in input ]
        v = [ ]
        vv = [ ]
        for i in range ( n ) :
            v.append ( a [ i % m ] )
            vv.append ( a [ i ] )
        