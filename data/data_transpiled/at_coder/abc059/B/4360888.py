def main ( args ) :
    import sys
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    s1 = join ( expanduser ( "~" ) , ".." , ".." , ".." )
    s2 = join ( expanduser ( "~" ) , ".." , ".." , ".." , ".." )
    if len ( s1 ) > len ( s2 ) :
        ans = "GREATER"
    elif len ( s1 ) < len ( s2 ) :
        ans = "LESS"
    else :
        ans = ( "GREATER" if s1 > s2 else ( "EQUAL" if s1 == s2 else "LESS" ) )
    print ( ans )
