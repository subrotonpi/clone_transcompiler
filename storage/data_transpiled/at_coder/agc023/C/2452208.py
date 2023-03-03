def Main ( ) :
    n = ni ( )
    mod = 1000000000 + 7
    ret = 0
    fif = enum_fif ( n + 1 , mod )
    if n == 2 :
        print ( 1 )
        return
    elif n == 3 :
        print ( 4 )
        return
    a = [ ]
    for k in range ( ( n + 1 ) // 2 , n - 1 ) :
        now = 1
        now *= fif [ 0 ] [ k ]
        now %= mod
        now *= fif [ 0 ] [ n - 1 - k ]
        now %= mod
        t = nlist ( n , n )
        t.write ( t )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.write ( '%.8f' % t )
        t.flush ( )
        t.flush ( )
        t.write ( '%.8f' % t )
