def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    from itertools import chain
    S = chain ( * repeat ( S ) )
    sys.stdin.write ( '{}\n'.format ( ''.join ( chain ( * repeat ( S ) ) ) ) )
    m_num = 0
    for c in S :
        if c == 'M' :
            m_num += 1
    m = [ ]
    at = len ( S ) - 1
    current = 0
    m_index = m_num - 1
    while m_index >= 0 :
        c = S [ at ]
        if c == 'M' :
            m.append ( current )
            m_index -= 1
        elif c == '+' :
            current += 1
        elif c == '-' :
            current -= 1
        at -= 1
    m.sort ( )
    ans = 0
    for i in range ( m_num // 2 ) :
        ans -= m [ i ]
    for i in range ( m_num // 2 , m_num ) :
        ans += m [ i ]
    print ( ans )
