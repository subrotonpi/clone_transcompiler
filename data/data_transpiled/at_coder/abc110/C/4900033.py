def main ( args ) :
    import os
    from collections import defaultdict
    from collections import defaultdict
    from os.path import expanduser
    sc = open ( expanduser ( '~/.ssh/config' ) )
    str1 = sc.read ( )
    str2 = sc.read ( )
    c = defaultdict ( defaultdict )
    for c1 , c2 in zip ( str1 , str2 ) :
        if c.has_key ( c1 ) :
            temp = c [ c1 ]
            if c2 != temp :
                print ( 'No' )
                return
        elif c.has_key ( c2 ) :
            print ( 'No' )
            return
        else :
            c [ c1 ].append ( c2 )
    print ( 'Yes' )
