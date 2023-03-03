def main ( ) :
    import sys
    import os
    import string
    import sys
    import csv
    class Main ( object ) :
        def __init__ ( self ) :
            sys.stdout.write ( '\n' )
            sys.stdout.flush ( )
    n = sys.argv [ 1 ]
    names = [ ]
    votes = [ ]
    for i in range ( 0 , n ) :
        name = sys.argv [ 2 ]
        if name not in names :
            names.append ( name )
        votes.append ( name )
    sys.stdout.flush ( )
    most_name = ''
    most_num = 0
    for name in names :
        count = 0
        for vote in votes :
            if vote == name :
                count += 1
            if count >= most_num :
                most_name = name
                most_num = count
    print ( most_name )
