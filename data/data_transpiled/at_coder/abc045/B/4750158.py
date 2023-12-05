def abc_ans ( str_a , str_b , str_c ) :
    import sys
    from os import path
    a = path.split ( str_a )
    b = path.split ( str_b )
    c = path.split ( str_c )
    a_count = len ( a )
    b_count = len ( b )
    c_count = len ( c )
    a_number = b_number = c_number = 0
    x = a [ a_number ]
    while True :
        if x == 'a' :
            if a_number >= len ( a ) :
                return ( 'A' , 'B' , 'C' )
            x = a [ a_number ]
            a_number += 1
        elif x == 'b' :
            if b_number >= len ( b ) :
                return ( 'B' , 'B' , 'C' )
            x = b [ b_number ]
            b_number += 1
        elif x == 'c' :
            if c_number >= len ( c ) :
                return ( 'C' , 'C' , 'C' )
            x = c [ c_number ]
            c_number += 1
