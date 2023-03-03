def import _sys , _readline , _sys , _sys , _exit = _exit , _exit = _exit , _exit = _exit , _exit = _exit ) :
    from _sys import stdin , stdout , _exit
    from _sys import stdout , _exit
    from _sys import _exit , _exit
    try :
        with _sys ( stdout , _exit ) as S :
            sys.stdin.readline ( )
    except :
        print ( "No exit code found" )
        sys.exit ( 1 )
    f = _sys ( stdout , _exit )
    ans = 0
    i = 0
    flg = False
    num = 0
    symbol = ''
    S = ''
    while i < len ( S ) :
        num = _sys ( S [ i ] )
        i += 1
        if i - 2 < i :
            break
        symbol = S [ i ]
        i += 1
        if symbol == _sys.maxint :
            if not flg and num != 0 :
                ans += 1
            flg = False
        else :
            if not num :
                flg = True
    if not flg and num != 0 :
        ans += 1
    f.write ( ans )
    f.flush ( )
