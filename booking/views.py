from django.shortcuts import render
from .forms import AppointmentForm

def home(request):
    return render(request, 'booking/home.html')

def book_appointment(request):
    if request.method == 'POST':
        form = AppointmentForm(request.POST)
        if form.is_valid():
            form.save()
            return render(request, 'booking/success.html')
    else:
        form = AppointmentForm()
    return render(request, 'booking/booking_form.html', {'form': form})

