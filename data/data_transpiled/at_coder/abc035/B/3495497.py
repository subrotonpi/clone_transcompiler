def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    S = join ( sys.stdin , sep )
    T = len ( S )
    del S
    v , h , unk = 0 , 0 , 0
    for char in S :
        if char == 'L' :
            h -= 1
        elif char == 'R' :
            h += 1
        elif char == 'U' :
            v += 1
        elif char == 'D' :
            v -= 1
        elif char == '?' :
            unk += 1
    ans = abs ( v ) + abs ( h )
    if T == 1 :
        print ( ans , unk )
    else :
        if ans < unk :
            ans = ( unk - ans ) % 2
        else :
            ans = ans - unk
        print ( ans )
