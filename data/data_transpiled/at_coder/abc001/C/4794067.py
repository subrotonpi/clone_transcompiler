def main ( ) :
    import sys
    from math import degrees
    try :
        sc = sys.stdin
    except :
        sc = 0
    deg = sc.getmaxyx ( ) [ 1 ]
    dis = sc.getmaxyx ( ) [ 2 ]
    if 172 <= _dis <= 207 :
        w = 9
    elif 245 <= _dis <= 284 :
        w = 10
    elif 285 <= _dis <= 326 :
        w = 12
    else :
        w = 'C'
    print ( dir , w )
