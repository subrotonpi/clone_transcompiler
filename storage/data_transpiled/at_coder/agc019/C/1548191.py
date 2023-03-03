def main ( ) :
    import math
    import random
    import random
    import sys
    import random
    import time
    import math
    class Main ( ) :
        def solve ( self ) :
            f = open ( '/dev/null' , 'r' )
            x1 = random.randint ( 0 , len ( f ) )
            y1 = random.randint ( 0 , len ( f ) )
            x2 = random.randint ( 0 , len ( f ) )
            y2 = random.randint ( 0 , len ( f ) )
            if y2 < y1 :
                sp = y2
                y2 = y1
                sp = x2
                x2 = x1
                x1 = sp
            N = random.randint ( 0 , len ( f ) )
            if x1 == x2 :
                exist = False
                for i in range ( N ) :
                    x = random.randint ( 0 , len ( f ) )
                    y = random.randint ( 0 , len ( f ) )
                    if y == x1 and y1 < y and y2 < y2 :
                        exist = True
                print ( 100L * ( y2 - y1 ) + ( 0 if ( not exist ) else 10 * math.pi - 20 ) )
            elif y1 == y2 :
                exist = False
                if x1 > x2 :
                    sp = x2
                    x2 = x1
                    x1 = sp
                for i in range ( N ) :
                    x = random.randint ( 0 , len ( f ) )
                    y = random.randint ( 0 , len ( f ) )
                    if y == y1 and x1 < x and y2 < x2 :
                        exist = True
                print ( 100L * ( x2 - x1 ) + ( 0 if ( not exist ) else 10 * math.pi - 20 ) )
            elif x1 < x2 :
                queue = [ ( a , b ) for a in f ]
                for i in range ( N ) :
                    queue.append ( ( a , b ) )
            else :
                queue = [ ]
                for i in range ( N ) :
                    queue.append ( ( a , b ) )
    return Main ( )
