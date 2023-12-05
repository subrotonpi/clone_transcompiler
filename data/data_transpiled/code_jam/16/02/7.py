def main ( ) :
    import sys
    with open ( 'test.txt' , 'r' ) as f :
        num_cases = len ( f.readlines ( ) )
        for case_num in range ( 1 , num_cases + 1 ) :
            stack = f.readlines ( )
            stack += '+'
            num_flips = 0
            last_char = stack [ 0 ]
            for char in stack [ 1 : ] :
                if char != last_char :
                    num_flips += 1
                    last_char = char
            print ( 'Case #{}: {}'.format ( case_num , num_flips ) )
