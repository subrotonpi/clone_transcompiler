def main ( args ) :
    import sys
    from os.path import expanduser
    sc = open ( expanduser ( '~/.py' ) )
    ans = 0
    s = sc.read ( )
    for c in s :
        if '+' == c :
            ans += 1
        else :
            ans -= 1
    print ( ans )
