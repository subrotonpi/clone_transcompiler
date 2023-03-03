def main ( ) :
    import sys
    try :
        with open ( 'moji.txt' ) as f :
            moji = f.read ( )
        if len ( moji ) >= 2 :
            moji = moji [ 0 ].upper ( ) + moji [ 1 ].lower ( )
        elif len ( moji ) == 1 :
            moji = moji.upper ( )
        print ( moji )
    except :
        print ( 'No moji found' )
