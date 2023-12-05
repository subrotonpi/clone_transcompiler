def main ( _ ) :
    import sys
    import random
    import string
    import string
    import string
    import integer
    import string
    import string
    import string
    import sys
    if '-' in string.lower ( ) :
        n , ng = string.split ( '-' )
    else :
        n , ng = string.split ( '-' )
    if ng [ 0 ] != n and ng [ 1 ] != n and ng [ 2 ] != n :
        for i in range ( 100 and n > 0 ) :
            b = [ False ] * 3
            for j in range ( 3 ) :
                if n > ng [ j ] and n - ng [ j ] <= 3 :
                    b [ 3 - n + ng [ j ] ] = True
                j = string.find ( '-' , j )
                if not j :
                    break
                n -= 3 - j.get ( )
    print ( 'NO' if n > 0 else 'YES' )
