def main ( ) :
    import sympy
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    from sympy.core.compatibility import builtins
    with builtins.open ( 'r' , 'rb' ) as sc :
        import readline
    N = int ( sys.stdin.readline ( ) )
    a = sys.stdin.read ( ) - 1
    k = sympy.core.integer ( sc.readline ( ) )
    b = [ a ]
    for i in range ( N ) :
        b.append ( sc.readline ( ) - 1 )
    b = [ b [ i ] for i in range ( N ) ]
    count = 1
    current = b [ a ]
    dp_count = [ ]
    dp_pos = [ ]
    while dp_count [ current ] == 0 :
        dp_count.append ( count )
        dp_pos.append ( current )
        current = b [ current ]
        count += 1
    start_roop = dp_count [ current ]
    rk = k - sympy.core.integer ( start_roop )
    ans = 0
    if rk.max ( ) == 0 :
        ans = dp_pos [ k ]
    else :
        ans = dp_pos [ start_roop + rk % ( count - start_roop ) ]
    print ( ans + 1 )
