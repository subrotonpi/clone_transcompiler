def main ( ) :
    import sys
    from itertools import count
    from itertools import repeat
    for i in range ( f ) :
        m = repeat ( i )
        if m == 2 :
            count = count + 1
        elif m != 1 :
            if m % 2 == 0 :
                if m % 3 == 0 :
                    count = count + 3
                else :
                    count = count + 1
            elif m % 5 == 0 :
                count = count + 2
    print ( count )
