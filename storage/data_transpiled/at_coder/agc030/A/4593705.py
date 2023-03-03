def main ( ) :
    import sys
    from itertools import repeat
    for a , b , c in repeat ( sys.stdin , 1 ) :
        if a + b + 1 >= c :
            print ( b + c )
        else :
            print ( b + ( a + b + 1 ) )
