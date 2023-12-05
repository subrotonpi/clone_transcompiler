def net.molsoft.snapper ( ) :
    import os
    import sys
    class SnapSolver ( object ) :
        def __init__ ( self ) :
            self.data_file = sys.argv [ 1 ]
    with open ( os.path.join ( os.path.dirname ( __file__ ) , 'data.txt' ) , 'r' ) as data_file :
        data = data_file.read ( )
    for i , line in enumerate ( data ) :
        numbers = line.split ( )
        num_snappers = eval ( numbers [ 0 ] )
        num_snaps = eval ( numbers [ 1 ] )
        tester = 0
        for j in range ( num_snappers ) :
            tester += 1 << j
        print ( "Case #%d: " % ( i + 1 ) , end = ' ' )
        if ( num_snaps & tester ) == tester :
            print ( "ON" )
        else :
            print ( "OFF" )
