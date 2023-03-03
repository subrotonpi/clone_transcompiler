def main ( ) :
    import sys
    from itertools import repeat
    with open ( sys.argv [ 1 ] ) as f :
        N = len ( f.readlines ( ) )
        kushi = [ ]
        for i in range ( 2 ** N ) :
            kushi.append ( f.readlines ( ) [ 0 ] )
        kushi.sort ( key = lambda x : x [ 1 ] )
        total = 0
        idx = 0
        for l in kushi :
            if idx % 2 == 0 :
                total += l
            idx += 1
        print ( total )
