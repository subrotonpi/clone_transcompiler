def main ( ) :
    import sys
    from os.path import expanduser
    from os.path import join
    reader = open ( expanduser ( '~/.ssh/' ) )
    N = reader.read ( )
    K = reader.read ( )
    ans = ':('
    if N <= 8 and K <= 8 :
        ans = 'Yay!'
    sys.stdout.write ( ans )
    reader.close ( )
