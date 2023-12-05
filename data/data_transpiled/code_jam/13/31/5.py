def test_a_large ( ) :
    import os
    import sys
    class A ( object ) :
        def is_vowel ( self , char ) :
            return char in [ 'a' , 'e' , 'i' , 'o' , 'u' ]
        def run_once ( self , input , output ) :
            line = input.readline ( )
            s = line.split ( )
            n = int ( line.split ( ) [ 1 ] )
            next_v = [ i for i in range ( len ( s ) - 1 , - 1 , - 1 ) if is_vowel ( s [ i ] ) ]
            else :
                if len ( s ) == - 1 :
                    next_v.append ( len ( s ) )
                else :
                    next_v.append ( next_v [ i + 1 ] )
        is_cons_cons = [ ( i >= ( i + n ) ) for i in range ( len ( s ) ) ]
        next_cons_cons = [ ( i <= n ) for i in range ( len ( s ) ) ]
        for i in range ( len ( s ) - 1 , - 1 , - 1 ) :
            if is_cons_cons [ i ] :
                next_cons_cons [ i ] = i
            else :
                if len ( s ) == - 1 :
                    next_cons_cons [ i ] = len ( s )
                else :
                    next_cons_cons [ i ] = next_cons_cons [ i + 1 ]
        ans = 0
        for i in range ( len ( s ) ) :
            next_cons_cons = [ i for i in range ( 1 , len ( s ) ) if is_cons_cons [ i ] ]
            if next_cons_cons [ i ] == len ( s ) :
                break
            first_pos = next_cons_cons [ i ] + n - 1
            ans += ( len ( s ) - first_pos )
        output.write ( ans )
