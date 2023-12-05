def import isareaRC
class Main ( object ) :
    def __init__ ( self ) :
        self.x1 = 0
        self.y1 = 0
        self.r = 1
        self.x2 = 0
        self.y2 = 0
        self.x3 = 0
        self.y3 = 0
    def isareaRC ( self ) :
        if self.x1 - self.r >= self.x2 and self.x1 + self.r <= self.x3 and self.y1 + self.r <= self.y3 and y1 - self.r >= self.y2 :
            return True
        return False
    def isareaCR ( self ) :
        if self.x2 - self.x1 >= self.x2 and self.x2 + self.r <= self.x3 and self.y2 + self.r <= self.y3 and self.y2 - self.r >= self.y2 :
            return True
        return False
    def isareaCR ( self ) :
        if self.x2 - self.x1 >= self.x2 :
            return True
        return False
    def isareaCR ( self ) :
        if self.x3 - self.x1 >= self.x2 and self.x2 + self.y2 <= self.y2 :
            return True
        return False
