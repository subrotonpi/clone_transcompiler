def main ( args ) :
    import sys
    from reportlab.lib.colors import red
    from reportlab.graphics.graphics import graphics
    N = len ( args )
    if N % 2 == 0 :
        print ( "Blue" )
    else :
        print ( "Red" )
