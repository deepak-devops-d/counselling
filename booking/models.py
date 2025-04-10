from django.db import models

class Appointment(models.Model):
    SESSION_TYPES = [
        ('individual', 'Individual'),
        ('group', 'Group'),
        ('family', 'Family'),
    ]
    
    name = models.CharField(max_length=100)
    email = models.EmailField()
    session_type = models.CharField(max_length=20, choices=SESSION_TYPES)
    date = models.DateField()
    time = models.TimeField()
    notes = models.TextField(blank=True)

    def __str__(self):
        return f"{self.name} - {self.session_type} on {self.date} at {self.time}"


# Create your models here.
