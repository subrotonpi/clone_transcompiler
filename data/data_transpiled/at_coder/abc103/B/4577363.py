def main ( args ) :
    import sys
    from os.path import expanduser
    sc = open ( expanduser ( '~/.ssh/bin/sh' ) )
    s1 = sc.read ( )
    s2 = sc.read ( )
    n = len ( s1 )
    ans = 0
    while n != 0 :
        s3 = switchs ( s1 , n )
        if s3 == s2 :
            ans = 1
            break
        n -= 1
    if ans == 1 :
        print ( 'Yes' )
    else :
        print ( 'No' )
