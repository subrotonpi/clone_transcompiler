def main ( ) :
    import sys
    import os
    for s in sys.stdin :
        cnt = 0
        for a , b in zip ( s [ 1 : ] , s [ 2 : ] ) :
            if a != b :
                cnt += 1
        print ( cnt )
