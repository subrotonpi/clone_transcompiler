def test_value ( ) :
    import sys
    import string
    import string
    import string
    import string
    import math
    class C :
        def __init__ ( self ) :
            self.values = [ ]
        def test_value ( self , s , cout ) :
            v = string.atoi ( s )
            ans = v * v
            ansstr = str ( ans )
            for i in range ( len ( ansstr ) ) :
                if ansstr [ i ] != ansstr [ - 1 - i ] :
                    return ans
            self.values.append ( ans )
        def initialize_values ( cout ) :
            self.values = [ ( '1' , '4' , '9' ) ]
            for len in range ( 2 , 50 ) :
                bits = len ( bits ) // 2
                for num in range ( ( 1 , bits ) ) :
                    digits = [ ]
                    tmp , sum = num , 0
                    for i in range ( bits ) :
                        digits.append ( tmp % 2 )
                        sum += digits [ i ]
                        tmp = tmp // 2
                    if not digits [ bits - 1 ] or sum >= 6 :
                        continue
                    first , second = '' , ''
                    for i in range ( bits ) :
                        first += digits [ bits - 1 - i ]
                        second += digits [ i ]
                    if len ( digits ) % 2 == 0 :
                        self.test_value ( first + second , cout )
                    else :
                        for i in range ( 0 , 2 ) :
                            self.test_value ( first + i + second , cout )
    f = open ( 'C-large-2.in' , 'r' )
    cout = sys.stdout
    initialize_values ( f )
    nb_cases = int ( f.readlines ( ) [ 0 ] )
    for case_no in range ( 1 , nb_cases + 1 ) :
        f.write ( '%d\n' % case_no )
