def _main ( * args ) :
    from os import environ as env
    env.stdout = None
    if len ( args ) == 0 :
        input = '.in'
        PARALLEL = 1
    else :
        input = args [ 0 ]
    if len ( args ) >= 2 :
        ID = int ( args [ 1 ] )
    else :
        input = '.in'
    try :
        solvers [ id ].solve ( )
    except RuntimeError as e :
        print ( "Error occurred in case %d:" % ( id + 1 , len ( solvers ) ) , file = sys.stderr )
        sys.exit ( 1 )
    try :
        solvers [ id ].write ( str ( sys.stdin.read ( ) ) )
    except OSError as e :
        print ( "Error occurred in case %d:" % ( id + 1 , len ( solvers ) ) , file = sys.stderr )
        sys.exit ( 1 )
    for i in range ( PARALLEL ) :
        try :
            solvers [ i ].write ( str ( sys.stdin.read ( ) ) )
        except OSError as e :
            print ( "Error occurred in case %d:" % ( id + 1 , len ( solvers ) ) , file = sys.stderr )
    else :
        print ( "======= output ======" , file = sys.stderr )
    for j in range ( 2 ) :
        for k in range ( n ) :
            if i & 1 :
                print ( str ( sys.stdin.read ( ) ) , file = sys.stderr )
            else :
                print ( "Error occurred in case %d:" % ( id + 1 , len ( solvers ) ) , file = sys.stderr )
    print ( max ( dp [ n & 1 ] [ 0 ] , dp [ n & 1 ] [ 0 ] ) , file = sys.stderr )
