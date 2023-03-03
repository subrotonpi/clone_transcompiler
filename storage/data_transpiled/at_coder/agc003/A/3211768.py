def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a , ns , we = [ 0 ] * 4 , 0 , 0
        s = sys.stdin.read ( )
        sc.close ( )
        for c in s :
            if c == 'N' : a [ 0 ] += 1
            elif c == 'W' : a [ 1 ] += 1
            elif c == 'S' : a [ 2 ] += 1
            else : a [ 3 ] += 1
        for i in range ( 0 , 4 , 2 ) :
            if a [ i ] : ns += 1
        for i in range ( 1 , 4 , 2 ) :
            if a [ i ] : we += 1
        print ( 'No' if ns % 2 or we % 2 else 'Yes' , end = ' ' )
