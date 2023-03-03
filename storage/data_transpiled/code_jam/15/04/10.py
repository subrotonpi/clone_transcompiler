def package ( ) :
    from mitja.codejam import ominoes
    from mitja.codejam import ominoes
    from mitja.codejam import ominoes
    from mitja.codejam import ominoes
    from mitja.function import solve
    from mitja.codejam import ominoes
    from mitja.codejam import ominoes
    from mitja.codejam import ominoes
    from mitja.codejam import ominoes
    from mitja.codejam import ominoes
    from mitja.function import function
    from mitja.codejam import ominoes
    for infile in ominoes.listdir ( ) :
        outfile = os.path.join ( os.path.dirname ( infile ) , infile + ".out" )
        outfile = open ( outfile , "w" )
        out = lambda str : ominoes.write ( str )
        outfile.write ( out )
        lines = ominoes.readlines ( )
        line_pos = 0
        n_cases = int ( lines [ line_pos ] )
        line_pos += 1
        for a in range ( 1 , n_cases + 1 ) :
            tmp = lines [ line_pos ].split ( )
            X = int ( tmp [ 0 ] )
            R = int ( tmp [ 1 ] )
            C = int ( tmp [ 2 ] )
            can_solve = solve ( X , R , C )
            out ( "Case #%d: %s\n" % ( a , "GABRIEL" if can_solve else "RICHARD" ) )
        outfile.close ( )
    def solve ( X , R , C ) :
        if X >= 7 : return False
        if ( R * C ) % X != 0 : return False
        min , max = min ( R , C ) , max ( R , C )
        if X > max : return False
        if X <= 2 : return True
        if X == 3 : return min > 1
        if X == 4 : return min > 2
        if X == 5 : return min >= 3 and ( min != 3 or max > 5 )
        assert X == 6
