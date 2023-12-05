def import sys , getopt , safewrite , runIO , args , res , out
from os import rename , safewrite , safewrite , args , out
def solve ( ) :
    s = args.pop ( 0 ).split ( ' ' )
    n = len ( s )
    maxChange = args.pop ( 0 )
    dp = [ [ ] for i in range ( maxChange + 2 ) ]
    for i in range ( n ) :
        dp [ 0 ] [ i ] [ i ] = 1
        if i + 1 < n :
            if s [ i ] == s [ i + 1 ] :
                dp [ 0 ] [ i ] [ i + 1 ] = 2
            else :
                dp [ 1 ] [ i ] [ i + 1 ] = 2
    for args in args :
        for fr in range ( 0 , n ) :
            to = fr + args.pop ( 0 )
            for ch in range ( 0 , maxChange ) :
                cur = dp [ ch ] [ fr ] [ to ]
                if fr > 0 :
                    dp [ ch ] [ fr - 1 ] [ to ] = max ( dp [ ch ] [ fr - 1 ] [ to ] , cur )
                if to + 1 < n :
                    dp [ ch ] [ fr ] [ to + 1 ] = max ( dp [ ch ] [ fr ] [ to + 1 ] , cur )
                if fr > 0 and to + 1 < n :
                    if s [ fr - 1 ] == s [ to + 1 ] :
                        dp [ ch ] [ fr - 1 ] [ to + 1 ] = max ( dp [ ch ] [ fr - 1 ] [ to + 1 ] , cur + 2 )
                    else :
                        dp [ ch + 1 ] [ fr - 1 ] [ to + 1 ] = max ( dp [ ch ] [ fr - 1 ] [ to + 1 ] , cur + 2 )
    res = 0
    for ch in range ( 0 , maxChange ) :
        res = max ( res , dp [ ch ] [ 0 ] [ n - 1 ] )
    out.write ( res )
